<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <XArchiveBatch>
            <xsl:for-each select="documents/document">
                <ArchiveRecord recordId="{concat('DOC-', @id)}">
                    <DocumentTitle><xsl:value-of select="title"/></DocumentTitle>
                    <SourceDepartment><xsl:value-of select="department"/></SourceDepartment>
                    <CurrentStatus><xsl:value-of select="status"/></CurrentStatus>
                </ArchiveRecord>
            </xsl:for-each>
        </XArchiveBatch>
    </xsl:template>
</xsl:stylesheet>