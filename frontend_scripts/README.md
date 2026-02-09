# 前端實用腳本

此目錄包含一組 Bash 腳本，旨在簡化前端開發任務。它們與 Linux、macOS 和 Windows (透過 Git Bash) 相容。

## 腳本總覽

### 操作類

- **`cleanup.sh`**: 強力清除。刪除 `node_modules`、`dist`、`.output`、`.nuxt` 並重新安裝依賴項目。當建置損壞或出現奇怪的快取問題時使用此腳本。
- **`cleanup.sh`**: 強力清除。刪除 `node_modules`、`dist`、`.output`、`.nuxt` 並重新安裝依賴項目。當建置損壞或出現奇怪的快取問題時使用此腳本。
- **`kill-port.sh [port]`**: 尋找並終止在指定連接埠上執行的程序。預設為連接埠 `3000`。當開發伺服器卡住時很有用。
- **`create-dir.sh [dirname]`**: 建立新資料夾。如果不提供名稱，會提示使用者輸入。若資料夾已存在會顯示警告。

### 工作流程類

- **`new-component.sh [Componentname]`**: 產生一個標準的 Vue 3 元件檔案 (`.vue`)，包含 `<script setup>`、template 和 scoped style。
- **`git-sync.sh`**: 取得更新、修剪已刪除的遠端分支，並拉取目前分支。安全且乾淨的同步方式。
- **`deps-check.sh`**: 執行 `npm outdated` 檢查依賴項目更新，而不修改任何內容。

### 設定類

- **`dev-setup.sh`**: 檢查 Node.js、npm 和 Git 是否已安裝並印出它們的版本。
- **`utils.sh`**: 包含其他腳本使用的輔助函式和顏色設定。

## 使用方式

### 直接執行 (Git Bash)

您可以直接從終端機執行腳本：

```bash
./frontend_scripts/cleanup.sh
./frontend_scripts/kill-port.sh 8080
./frontend_scripts/new-component.sh MyButton
```

### 加入 package.json (推薦)

將這些指令加入您的 `package.json` scripts區塊以便於存取：

```json
"scripts": {
  "clean:deep": "bash frontend_scripts/cleanup.sh",
  "kill": "bash frontend_scripts/kill-port.sh",
  "gen:component": "bash frontend_scripts/new-component.sh",
  "sync": "bash frontend_scripts/git-sync.sh",
  "deps:check": "bash frontend_scripts/deps-check.sh"
}
```

然後您可以使用 npm 執行它們：

```bash
npm run clean:deep
npm run kill -- 3000
npm run gen:component -- MyHeader
```

## Windows 使用者注意事項

請確保您使用 **Git Bash** 或類似的 Bash 模擬器來執行這些腳本。它們依賴標準的 bash 指令。
