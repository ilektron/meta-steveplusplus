FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://mzdpi.cfg \
    file://mzdpi-overlay.dts;subdir=git/arch/${ARCH}/boot/dts/overlays \
    "

KERNEL_DEVICETREE += "overlays/mzdpi.dtbo"

