/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.fabric.mounting.mountitems;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.mounting.MountingManager;

public class DispatchStringCommandMountItem extends DispatchCommandMountItem {

  private final int mReactTag;
  @NonNull private final String mCommandId;
  private final @Nullable ReadableArray mCommandArgs;

  public DispatchStringCommandMountItem(
      int reactTag, @NonNull String commandId, @Nullable ReadableArray commandArgs) {
    mReactTag = reactTag;
    mCommandId = commandId;
    mCommandArgs = commandArgs;
  }

  @Override
  public void execute(@NonNull MountingManager mountingManager) {
    mountingManager.receiveCommand(mReactTag, mCommandId, mCommandArgs);
  }

  @Override
  public String toString() {
    return "DispatchStringCommandMountItem [" + mReactTag + "] " + mCommandId;
  }
}
