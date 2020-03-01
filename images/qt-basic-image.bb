# Copyright (C) 2020 Stephen Farnsworth <steve@steveplus.plus>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Basic qt5 image"

require rpi-mzdpi.bb

QT_DEV_TOOLS = " \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
    qtserialport-dev \
    qtserialport-mkspecs \
"

QT_TOOLS = " \
    qtbase \
    qtserialport \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

IMAGE_INSTALL += " \
    ${FONTS} \
    ${QT_DEV_TOOLS} \
    ${QT_TOOLS} \
    ${TSLIB} \
    omxplayer \
"

export IMAGE_BASENAME = "qt5-basic-image"
