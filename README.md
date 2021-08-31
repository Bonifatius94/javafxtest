
# OpenJDK 11 with JavaFX

## About
This project provides a boilerplate for creating a JavaFX desktop app running OpenJDK 11.

*Info: This entire tutorial assumes a Debian-like system. It's tested for Ubuntu 20.04.*

## Build Toolchain Setup

### Install OpenJDK 11 and Maven

```sh
# install the official OpenJDK 11 apt package and Maven build toolchain
sudo apt-get update && sudo apt-get install -y openjdk-11-jdk maven

# register the Java environment variables used for development
echo 'export JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64/"' >> ~/.bashrc
echo 'export PATH="$PATH:/usr/lib/jvm/java-11-openjdk-amd64/bin"' >> ~/.bashrc
source ~/.bashrc

# make sure the OpenJDK is set up properly
java --version
```

### Install VSCode

```sh
# install the official VSCode snap package
sudo snap install code --classic

# install the OpenJDK extensions for development
code --install-extension vscjava.vscode-java-pack
code --install-extension shrey150.javafx-support
code --install-extension bilalekrem.scenebuilderextension
code --install-extension redhat.fabric8-analytics
```

## Build / Test the App

```sh
# clean target, build code, run unit tests, launch the app
mvn clean javafx:run

# clean target, build code, run unit tests, package as zip
mvn clean javafx:jlink
target/javafxtest/bin/launcher
```

## License
No license, feel free to use this boilerplate for your project.
