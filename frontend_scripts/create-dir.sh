#!/bin/bash

# create-dir.sh - 建立新資料夾

# 引入 utils
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
source "$SCRIPT_DIR/utils.sh"

DIR_NAME=$1

if [ -z "$DIR_NAME" ]; then
    read -p "請輸入資料夾名稱: " DIR_NAME
fi

if [ -z "$DIR_NAME" ]; then
    log_error "必須輸入資料夾名稱。"
    exit 1
fi

if [ -d "$DIR_NAME" ]; then
    log_warn "資料夾 '$DIR_NAME' 已經存在。"
else
    mkdir -p "$DIR_NAME"
    if [ $? -eq 0 ]; then
        log_success "已建立資料夾: $DIR_NAME"
    else
        log_error "建立資料夾失敗。"
        exit 1
    fi
fi
