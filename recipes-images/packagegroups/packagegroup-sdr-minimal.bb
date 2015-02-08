# Minimal runtime gnuradio packages

LICENSE = "MIT"

inherit packagegroup

PROVIDES = "${PACKAGES}"

RDEPENDS_${PN} += " \
    alsa-utils \
    i2c-tools \
    gnuradio \
    screen \
    vim \
    vim-vimrc \
    libudev \
    procps \
    python \
    python-cheetah \
    python-modules \
    python-argparse \
    python-distutils \
    python-numpy \
    resolvconf \
    rtl-sdr \
    wget \
    zip \
"
