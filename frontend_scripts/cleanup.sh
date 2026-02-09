#!/bin/bash

# cleanup.sh - 深度清理專案並重新安裝依賴項目

# 引入 utils
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
source "$SCRIPT_DIR/utils.sh"

log_info "開始清理專案..."

# 移除鎖定檔? (選用)
# rm package-lock.json

# 要移除的目錄
DIRS=("node_modules" "dist" ".output" ".nuxt")

for dir in "${DIRS[@]}"; do
    if [ -d "$dir" ]; then
        log_info "移除 $dir..."
        rm -rf "$dir"
    fi
done

log_success "清理完成。"

log_info "正在重新安裝依賴項目..."
if command_exists npm; then
    npm install
elif command_exists xiaomicmd; then
    # 備案或其他套件管理員，但目前以 standard npm 為主
    log_error "找不到 npm!"
    exit 1
fi

log_success "依賴項目已安裝。專案準備就緒。"
