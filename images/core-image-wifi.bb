SUMMARY = "Minimal image for the pi zero w"
HOMEPAGE = "https://steveplus.plus"

include recipes-core/images/core-image-base.bb

DEPENDS += "bcm2835-bootfiles"

EXTRA_PACKAGES = " \
    openssh \
    dtc \
"

WIFI = " \
    iw \
    linux-firmware-rpidistro-bcm43430 \
    linux-firmware-rpidistro-bcm43455 \
    wpa-supplicant \
"

IMAGE_INSTALL += " \
    ${EXTRA_PACKAGES} \
    ${WIFI} \
"
IMAGE_FEATURES += " package-management"

IMAGE_ROOTFS_EXTRA_SPACE = "100000"

export IMAGE_BASENAME = "core-image-wifi"
