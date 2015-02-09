FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
        file://gr-osmosdr-fix-debian-lib64-suffix.patch \
        file://gr-osmosdr-fix-cmakelists-gnurdadio-required-version.patch \
        "
