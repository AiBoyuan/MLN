/**
  * Created by MomoLuaNative.
  * Copyright (c) 2019, Momo Group. All rights reserved.
  *
  * This source code is licensed under the MIT.
  * For the full copyright and license information,please view the LICENSE file in the root directory of this source tree.
  */
package com.immomo.mls.adapter;

/**
 * Created by Xiong.Fangyu on 2019/1/7
 *
 * app状态
 */
public interface MLSAppForegroundAdapter {
    /**
     * app是否在前台
     * @return true: 在前台
     */
    boolean isForeground();
}