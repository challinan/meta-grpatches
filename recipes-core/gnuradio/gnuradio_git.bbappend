FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
        file://gnuradio-fix-debian-lib64-suffix.patch \
        file://reminder-to-fix-missing-FindRnuradio-cmake.patch \
        "
