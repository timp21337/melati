/*
 * $Source$
 * $Revision$
 *
 * Copyright (C) 2013 Tim Pizey
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

package org.melati.poem.dbms.test.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The JDBC4.1 members of a {@link PreparedStatement}, 
 * decorated to throw an SQLException on command.
 * 
 * @author timp
 * @since  2013/07/07
 *
 */
public abstract class ThrowingPreparedStatementJdbc4_1
    extends ThrowingPreparedStatementJdbc4
    implements PreparedStatement {

 @Override
 public void closeOnCompletion() throws SQLException {
     if (shouldThrow(this.getClass().getInterfaces()[0], "closeOnCompletion"))
         throw new SQLException("PreparedStatement.closeOnCompletion() bombed");
 }

 @Override
 public boolean isCloseOnCompletion() throws SQLException {
     if (shouldThrow(this.getClass().getInterfaces()[0], "isCloseOnCompletion"))
         throw new SQLException("PreparedStatement.isCloseOnCompletion() bombed");
       return it.isCloseOnCompletion();
 }

}
