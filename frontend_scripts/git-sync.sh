#!/bin/bash

# git-sync.sh - 安全的 git 同步 (pull 並修剪)

# 引入 utils
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
source "$SCRIPT_DIR/utils.sh"

log_info "正在取得更新並修剪遠端分支..."
git fetch -p

CURRENT_BRANCH=$(git branch --show-current)
log_info "目前分支: $CURRENT_BRANCH"

log_info "正在拉取最新變更..."
git pull

if [ $? -eq 0 ]; then
    log_success "Git 同步完成。"
else
    log_error "Git pull 失敗。請檢查是否有衝突。"
    exit 1
fi
