/* PolicyListHolder.java --
   Copyright (C) 2005, 2006 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package org.omg.CORBA;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.Streamable;

/**
* A holder for the object <code>Policy[]</code>.
*
* @author Audrius Meskauskas, Lithuania (AudriusA@Bioinformatics.org)
*/
public final class PolicyListHolder
  implements Streamable
{
  /**
   * The stored Policy[] value.
   */
  public Policy[] value;

  /**
   * Create the uninitialised instance, leaving the value field
   * with default <code>null</code> value.
   */
  public PolicyListHolder()
  {
  }

  /**
   * Create the initialised instance.
   * @param initialValue the value that will be assigned to
   * the <code>value</code> field.
   */
  public PolicyListHolder(Policy[] initialValue)
  {
    value = initialValue;
  }

  /**
   * Fill in the {@link #value} by data from the CDR stream.
   * Uses {@link PolicyListHelper}.
   *
   * @param input the org.omg.CORBA.portable stream to read.
   */
  public void _read(InputStream input)
  {
    value = PolicyListHelper.read(input);
  }

  /**
   * Write the stored value into the CDR stream.
   * Uses {@link PolicyListHelper}.
   *
   * @param output the org.omg.CORBA.portable stream to write.
   */
  public void _write(OutputStream output)
  {
    PolicyListHelper.write(output, value);
  }

  /**
   * Get the typecode of the Policy[].
   * Uses {@link PolicyListHelper}.
   */
  public org.omg.CORBA.TypeCode _type()
  {
    return PolicyListHelper.type();
  }
}
