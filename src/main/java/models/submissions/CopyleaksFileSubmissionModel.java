/*
 The MIT License(MIT)
 Copyright(c) 2016 Copyleaks LTD (https://copyleaks.com)
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
*/

package models.submissions;

import models.submissions.properties.SubmissionProperties;

public class CopyleaksFileSubmissionModel extends CopyleaksSubmissionModel {
    /**
     * @param base64 A base64 data string of a file. If you would like to scan plain text, encode it as base64 and submit it.
     * @param filename The name of the file as it will appear in the Copyleaks scan report Make sure to include the right extension for your filetype.
     * @param properties Check inner properties for more details.
     */
    private String base64;
    private String filename;

    public CopyleaksFileSubmissionModel(String base64, String filename, SubmissionProperties properties) {
        super(properties);
        this.base64 = base64;
        this.filename = filename;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
