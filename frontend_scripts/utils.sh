#!/bin/bash

# utils.sh - 前端腳本共用工具

# 顏色設定
GREEN='\033[0;32m'
BLUE='\033[0;34m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
NC='\033[0m' # No Color

# 記錄函式
log_info() {
    echo -e "${BLUE}[資訊]${NC} $1"
}

log_success() {
    echo -e "${GREEN}[成功]${NC} $1"
}

log_warn() {
    echo -e "${YELLOW}[警告]${NC} $1"
}

log_error() {
    echo -e "${RED}[錯誤]${NC} $1"
}

# 檢查指令是否存在
command_exists() {
    command -v "$1" >/dev/null 2>&1
}

# 跨平台開啟 URL
open_url() {
    if command_exists xdg-open; then
        xdg-open "$1"
    elif command_exists open; then
        open "$1"
    elif command_exists start; then
        start "$1"
    else
        log_warn "無法開啟網址: $1"
    fi
}
