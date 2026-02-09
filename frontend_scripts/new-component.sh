#!/bin/bash

# new-component.sh - 建立新的 Vue 3 元件

# 引入 utils
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
source "$SCRIPT_DIR/utils.sh"

COMPONENT_NAME=$1

if [ -z "$COMPONENT_NAME" ]; then
    read -p "請輸入元件名稱 (例如 MyButton): " COMPONENT_NAME
fi

if [ -z "$COMPONENT_NAME" ]; then
    log_error "必須輸入元件名稱。"
    exit 1
fi

# 確保 components 目錄存在 (假設為標準的 src/components 或 components)
TARGET_DIR=""
if [ -d "src/components" ]; then
    TARGET_DIR="src/components"
elif [ -d "components" ]; then
    TARGET_DIR="components"
else
    # 如果都不存在，建立 src/components
    mkdir -p "src/components"
    TARGET_DIR="src/components"
fi

FILE_PATH="$TARGET_DIR/$COMPONENT_NAME.vue"

if [ -f "$FILE_PATH" ]; then
    log_warn "元件 $COMPONENT_NAME 已存在於 $FILE_PATH"
    exit 1
fi

# 建立元件檔案
cat > "$FILE_PATH" <<EOF
<script setup lang="ts">
// Props
// defineProps<{
//   modelValue?: string
// }>()

// Emits
// defineEmits<{
//   (e: 'update:modelValue', value: string): void
// }>()

</script>

<template>
  <div class="$COMPONENT_NAME">
    <!-- Component Content -->
    $COMPONENT_NAME 元件
  </div>
</template>

<style scoped>
/* Styles */
</style>
EOF

log_success "已建立元件: $FILE_PATH"
