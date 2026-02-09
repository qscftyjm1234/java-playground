#!/bin/bash

# kill-port.sh - 終止在指定 port 上執行的程序

# 引入 utils
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
source "$SCRIPT_DIR/utils.sh"

PORT=${1:-3000}

log_info "正在檢查 port $PORT 上的程序..."

# 偵測作業系統 (Windows 的 MinGW/Git Bash 通常回報為 MINGW* 或 MSYS*)
OS="$(uname -s)"
PID=""

if [[ "$OS" == *"MINGW"* ]] || [[ "$OS" == *"MSYS"* ]] || [[ "$OS" == *"CYGWIN"* ]]; then
    # Windows (Git Bash)
    # netstat -ano output:   TCP    0.0.0.0:3000           0.0.0.0:0              LISTENING       12345
    PID=$(netstat -ano | grep ":$PORT " | awk '{print $5}' | head -n 1)
    
    if [ -n "$PID" ]; then
        log_info "找到程序 PID: $PID。正在終止..."
        taskkill //F //PID "$PID"
    else
        log_info "在 port $PORT 上未找到任何程序。"
        exit 0
    fi

else
    # Linux / macOS
    PID=$(lsof -t -i:$PORT)
    
    if [ -n "$PID" ]; then
        log_info "找到程序 PID: $PID。正在終止..."
        kill -9 "$PID"
    else
        log_info "在 port $PORT 上未找到任何程序。"
        exit 0
    fi
fi

if [ $? -eq 0 ]; then
    log_success "Port $PORT 現在已釋放。"
else
    log_error "無法終止 port $PORT 上的程序。"
fi
