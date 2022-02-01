<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2> Books Category </h2>
                <table border="1">
                    <tr bgcolor="yellow">
                        <th>Title</th>
                        <th>Author</th>
                    </tr>
                    <xsl:for-each select="books/book">
                        <tr>
                            <td bgcolor="grey">
                                <xsl:value-of select="title"/>
                            </td>
                            <td bgcolor="goldenrod">
                                <xsl:value-of select="author"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
