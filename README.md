# Crystal PvP Helper

This repository contains a Fabric mod (Crystal PvP Helper). I applied a set of basic fixes to make the project layout and metadata follow Fabric conventions.

What I changed

- Renamed the package to `io.progamerw2026.crystalpvphelper` and formatted the main mod initializer.
- Added `src/main/resources/fabric.mod.json` with mod metadata and entrypoint.
- Added an MIT LICENSE, a `.gitignore`, and this README.

Building

This repository is missing a full Gradle/Fabric Loom build configuration. To build this mod locally, create a standard Fabric Loom project (for example using the Fabric example mod) and copy the `src` and `fabric.mod.json` files into it, or refer to Fabric Loom documentation:

- Fabric Loom: https://fabricmc.net/wiki/tutorial:setup

Notes

- I did not add a Gradle build script because that requires choosing plugin versions and a Java toolchain. If you want, I can also add a working `build.gradle` and Gradle wrapper configured for Fabric Loom; tell me which Minecraft and Fabric Loader versions you want supported and I'll add them.

- The repository name is alarming/unprofessional. Consider renaming to something descriptive like `crystalpvphelper`.

License

This project is licensed under the MIT License (see LICENSE).
