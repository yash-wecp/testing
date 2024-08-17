echo "Installing and setting up vs code extensions"
# Angular
code-server --install-extension mgmcdermott.vscode-language-babel
code-server --install-extension angular.ng-template
code-server --install-extension johnpapa.angular2

# Java
code-server --install-extension vscjava.vscode-java-pack
code-server --install-extension vscjava.vscode-java-debug
code-server --install-extension redhat.vscode-yaml
code-server --install-extension redhat.vscode-xml
code-server --install-extension redhat.java
code-server --install-extension VMware.vscode-spring-boot

# Others
code-server --install-extension alphabotsec.vscode-eclipse-keybindings
code-server --install-extension rangav.vscode-thunder-client
code-server --install-extension sonarsource.sonarlint-vscode
code-server --install-extension CodeStream.codestream-14.29.1.vsix && rm -rf CodeStream.codestream-14.29.1.vsix  # code-server --install-extension CodeStream.codestream


