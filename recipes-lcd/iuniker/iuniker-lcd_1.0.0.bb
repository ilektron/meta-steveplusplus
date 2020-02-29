# Copyright (C) 2020 Unknown User <unknown@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Driver for the iUniker 2.8in 640x480 touch screen for the pi zero"
HOMEPAGE = "https://www.iunikerpi.com/raspberry-pi-zero-w-screen-iuniker-28-inch-60-fps-640x480-high-resolution-raspberry-pi-zero-touchscreen-hd-raspberry-pi-screen-high-speed-pi-displa-p0-p0038.html"
LICENSE = "LGPLv3"
SECTION = ""
DEPENDS = " xf86-input-evdev matchbox-keyboard xinput-calibrator"
LIC_FILES_CHKSUM="file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

PR = "r3"

S = "${WORKDIR}"

SRC_URI = "https://github.com/tianyoujian/MZDPI.git"
SRCREV="3bea7102e2b697cc79d499c912316fc86d89aaf1"

SRC_URI[md5sum] = "e54667ae279a44a6172f0ef5ba969554"
SRC_URI[sha256sum] = "70e9983c6a544a8a050bc75d6bfa0f81533554d928ca81adfffa5b01972075f9"

do_install() {
}
