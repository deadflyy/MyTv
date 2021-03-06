/*******************************************************************************
 * Copyright 2015 htd0324@gmail.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.laudandjolynn.mytv.exception;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2015年3月25日 上午9:18:03
 * @copyright: www.laudandjolynn.com
 */
public class MyTvException extends RuntimeException {
	private static final long serialVersionUID = -2699920699817552410L;

	public MyTvException() {
		super();
	}

	public MyTvException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyTvException(String message) {
		super(message);
	}

	public MyTvException(Throwable cause) {
		super(cause);
	}

}
