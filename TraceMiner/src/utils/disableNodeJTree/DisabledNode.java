/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils.disableNodeJTree;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Luciana
 */
public class DisabledNode extends DefaultMutableTreeNode {
  protected boolean enabled;

  public DisabledNode() {
    this(null, true, true);
  }

  public DisabledNode(Object userObject) {
    this(userObject, true, true);
  }

  public DisabledNode(Object userObject, boolean allowsChildren) {
    this(userObject, allowsChildren, true);
  }

  public DisabledNode(Object userObject, boolean allowsChildren,
      boolean enabled) {
    super(userObject, allowsChildren);
    this.enabled = enabled;
  }

  public int getChildCount() {
    if (enabled) {
      return super.getChildCount();
    } else {
      return 0;
    }
  }

  public boolean isLeaf() {
    return (super.getChildCount() == 0);
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public boolean isEnabled() {
    return enabled;
  }
}
