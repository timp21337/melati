/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2005 Tim Pizey
 *
 * Part of Melati (http://melati.org), a framework for the rapid
 * development of clean, maintainable web applications.
 *
 * Melati is free software; Permission is granted to copy, distribute
 * and/or modify this software under the terms either:
 *
 * a) the GNU General Public License as published by the Free Software
 *    Foundation; either version 2 of the License, or (at your option)
 *    any later version,
 *
 *    or
 *
 * b) any version of the Melati Software License, as published
 *    at http://melati.org
 *
 * You should have received a copy of the GNU General Public License and
 * the Melati Software License along with this program;
 * if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA to obtain the
 * GNU General Public License and visit http://melati.org to obtain the
 * Melati Software License.
 *
 * Feel free to contact the Developers of Melati (http://melati.org),
 * if you would like to work out a different arrangement than the options
 * outlined here.  It is our intention to allow Melati to be used by as
 * wide an audience as possible.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Contact details for copyright holder:
 *
 *     Tim Pizey <timp At paneris.org>
 *     http://paneris.org/~timp
 */
package org.melati.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.net.URLDecoder;

import org.melati.Melati;

/**
 * A utility class to work around need for catch block.
 */
public final class UTF8URLEncoder {
  
  private UTF8URLEncoder() {}

  /**
   * Encode with default encoding.
   * @param s the String to encode
   * @return the encoded String
   */
  public static String encode(String s) {
    return encode(s, Melati.DEFAULT_ENCODING);
  }

  /**
   * Encode with an encoding.
   * @param s the String to encode
   * @param encoding the character encoding to use 
   * @return the encoded String
   */
  public static String encode(String s, String encoding) {
    String encoded = null;
    try {
      encoded = URLEncoder.encode(s, encoding);
    } catch (UnsupportedEncodingException e) {
      throw new UnexpectedExceptionException(e);
    }
    return encoded;
  }

  /**
   * Decode using default character encoding.
   * @param s the String to decode
   * @return the decoded String
   */
  public static String decode(String s) {
    return decode(s, Melati.DEFAULT_ENCODING);
  }
  
  /**
   * Decode with an encoding.
   * @param s the String to decode
   * @param encoding the character encoding to use 
   * @return the decoded String
   */
  public static String decode(String s, String encoding) {
    String decoded = null;
    try {
      decoded = URLDecoder.decode(s, encoding);
    } catch (UnsupportedEncodingException e) {
      throw new UnexpectedExceptionException(e);
    }
    return decoded;
  }
  
}
