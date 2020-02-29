# This is a simple recipe for blacklisting the vc4 module because it is broken with the setup used

DESCRIPTION = "Blacklist the vc4 driver that may cause issues with certain settings on hdmi"
PR = "r0"

DEPENDS = ""

do_install() {
    ## Copy our blacklist to /etc/modprobe.d
    install -m 0755 -d 

}
