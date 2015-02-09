FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

do_install_append() {
    # Nuke the errant '\n' chars in Qt.py
    sed -i -e 's:\\n::g' ${D}${libdir}/${PYTHON_DIR}/site-packages/PyQt4/Qt.py
}
