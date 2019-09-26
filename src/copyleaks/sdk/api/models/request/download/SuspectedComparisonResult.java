/********************************************************************************
 The MIT License(MIT)
 
 Copyright(c) 2016 Copyleaks LTD (https://copyleaks.com)
 
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
 
 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.
 
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
********************************************************************************/

package copyleaks.sdk.api.models.request.download;

import java.io.Serializable;
import java.util.Arrays;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SuspectedComparisonResult implements Serializable {

	private static final long serialVersionUID = 6339633407858614230L;

	@SerializedName("groupId")
	@Expose
	private Integer[] groupId;
	@SerializedName("source")
	@Expose
	private MatchRanges source;
	@SerializedName("suspected")
	@Expose
	private MatchRanges suspected;

	public SuspectedComparisonResult() {
	}

	public SuspectedComparisonResult(Integer[] groupId, MatchRanges source, MatchRanges suspected) {
		super();
		this.groupId = groupId;
		this.source = source;
		this.suspected = suspected;
	}

	public Integer[] getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer[] groupId) {
		this.groupId = groupId;
	}

	public MatchRanges getSource() {
		return source;
	}

	public void setSource(MatchRanges source) {
		this.source = source;
	}

	public MatchRanges getSuspected() {
		return suspected;
	}

	public void setSuspected(MatchRanges suspected) {
		this.suspected = suspected;
	}

	@Override
	public String toString() {
		return "SuspectedComparisonResult [groupId=" + Arrays.toString(groupId) + ", source=" + source + ", suspected="
				+ suspected + "]";
	}

}
