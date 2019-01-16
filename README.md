# Karlsruhe Architectural Maintainability Prediction (KAMP) [![Build Status](https://travis-ci.org/KAMP-Research/KAMP_CPRL.svg?branch=master)](https://travis-ci.org/KAMP-Research/KAMP_CPRL) [![Issues](https://img.shields.io/github/issues/KAMP-Research/KAMP_CPRL.svg)](https://github.com/KAMP-Research/KAMP_CPRL/issues) [![License](https://img.shields.io/github/license/KAMP-Research/KAMP_CPRL.svg)](https://raw.githubusercontent.com/KAMP-Research/KAMP_CPRL/master/LICENSE) [![Deployment](https://img.shields.io/github/last-commit/KAMP-Research/KAMP_CPRL/master.svg?label=last%20deployed%20nightly)](https://martinloeper.github.io/updatesite/nightly) [![Release](https://img.shields.io/github/release/KAMP-Research/KAMP_CPRL.svg)](https://martinloeper.github.io/updatesite/release)

KAMP is an approach to analyze the change propagation in a software system from technical and organizational perspectives. It is based on the software architecture annotated with technical (e.g. deployment) and organizational artifacts (e.g. management).

## Installer
There is an installer for every major OS:
- [Windows 64 bit](https://github.com/MartinLoeper/KAMP-Windows-Installer)
- [Windows 32 bit](https://github.com/MartinLoeper/KAMP-Windows-32bit-Installer)
- [OSX 64 bit](https://github.com/MartinLoeper/KAMP-OSX-Installer)
- [Linux 64 bit](https://github.com/MartinLoeper/KAMP-Linux-Installer)
- [Linux 32 bit](https://github.com/MartinLoeper/KAMP-Linux-32bit-Installer)

Using the installer is usually much faster than wiring up all the components together manually.
In particular, all users which share multiple Eclipse installations will benefit from the installer's underlying [bundle pool](https://stackoverflow.com/questions/28746404/what-does-the-bundle-pool-option-in-the-eclipse-installer-has-to-offer).

## Update Site
In order to install KAMP, open an [Eclipse (Modelling Tools) Oxygen Installation](https://www.eclipse.org/downloads/packages/release/Oxygen/3.RC3), `Help -> Install New Software...` and insert the following into the 'work with' input field: https://martinloeper.github.io/updatesite/nightly.

More information at the [updatesite repository](https://github.com/MartinLoeper/updatesite).

## Related Projects
1) This project is a major restructuring of the [submodule-based KAMP repository](https://github.com/KAMP-Research/KAMP).
2) This project includes the [KAMP Rule Language](https://github.com/MartinLoeper/KAMP-DSL).
3) This project originates from [KAMP 2.0](https://github.com/MartinLoeper/KAMP-2.0). It was handed over after the Bachelor Thesis.

## Changelog
- This fork brings Continuous Integration to KAMP and enables our partners to install the framework more easily.
- KAMP Rule Language was added as a new feature

## Credits
This project was structured according to [Vitruv](https://github.com/vitruv-tools/Vitruv). A big shout-out to HeikoKlare, max-kramer and all other colleagues of the [kit-sdq](https://github.com/kit-sdq) team for setting up all this Maven Tycho stuff on Travis.

The following article by Lars Vogel and Simon Scholz was also very useful: http://www.vogella.com/tutorials/EclipseTycho/article.html
