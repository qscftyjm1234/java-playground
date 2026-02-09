#!/bin/bash

# dev-setup.sh - 檢查開發環境

# 引入 utils
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
source "$SCRIPT_DIR/utils.sh"

log_info "正在檢查開發環境..."

# 檢查 Node.js
if command_exists node; then
    NODE_VERSION=$(node -v)
    log_success "已找到 Node.js: $NODE_VERSION"
else
    log_error "找不到 Node.js！請先安裝。"
fi

# 檢查 npm
if command_exists npm; then
    NPM_VERSION=$(npm -v)
    log_success "已找到 npm: $NPM_VERSION"
else
    log_error "找不到 npm！請先安裝。"
fi

# 檢查 Git
if command_exists git; then
    GIT_VERSION=$(git --version)
    log_success "已找到 Git: $GIT_VERSION"
else
    log_error "找不到 Git！請先安裝。"
fi

# 檢查 VS Code (選用)
if command_exists code; then
    log_success "已找到 VS Code CLI。"
else
    log_warn "找不到 VS Code CLI 'code' 指令 (選用)。"
fi

log_info "環境檢查完成。"
