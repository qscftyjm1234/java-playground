#!/bin/bash

# deps-check.sh - 檢查過期的依賴項目

# 引入 utils
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
source "$SCRIPT_DIR/utils.sh"

log_info "正在檢查過期的依賴項目..."

if ! command_exists npm; then
    log_error "找不到 npm 指令"
    exit 1
fi

# 執行 npm outdated，但如果發現項目不要回傳錯誤代碼 (npm 如果發現過期項目會回傳 1)
npm outdated

STATUS=$?

if [ $STATUS -eq 0 ]; then
    log_success "所有依賴項目都是最新的！"
else
    echo ""
    log_warn "發現部分依賴項目已過期。"
    log_info "執行 'npm update' 來更新次要/修補版本，"
    log_info "或手動安裝特定版本以進行主要更新。"
fi
