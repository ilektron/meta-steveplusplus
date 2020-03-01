do_deploy_append() {
    echo "# Enable the iUniker 2.8in Touchscreen" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "gpio=18=op,dh" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtparam=spi=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=ads7846,penirq=27,swapxy=1,xmin=200,xmax=3850,ymin=200,ymax=3850" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "display_rotate=3" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=mzdpi" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "framebuffer_width=640" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "framebuffer_height=480" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "enable_dpi_lcd=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "display_default_lcd=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dpi_group=2" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dpi_mode=87" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dpi_output_format=0x07f003" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "hdmi_timings=480 0 41 20 60 640 0 5 10 10 0 0 0 60 0 32000000 1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
