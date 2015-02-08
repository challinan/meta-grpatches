SUMMARY = "Core image sato with sdr target components"

IMAGE_FEATURES += "qt4-pkgs x11-base x11-sato splash"

LICENSE = "MIT"

CORE_IMAGE_EXTRA_INSTALL += "\
    gqrx \
    directfb-examples \
    python-pyqt \
    packagegroup-sdr-base-extended \
    packagegroup-sdr-python \
    packagegroup-sdr-gnuradio \
    packagegroup-sdr-hardware \
    xauth \
    "
# removed gr-ais, gr-mac, gr-baz

inherit core-image
