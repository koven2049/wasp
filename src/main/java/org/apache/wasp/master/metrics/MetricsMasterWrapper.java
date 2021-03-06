/**
 * Copyright The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.apache.wasp.master.metrics;

/**
 * This is the interface that will expose information to hadoop implementations
 * of the MetricsMasterSource.
 */
public interface MetricsMasterWrapper {

  /**
   * Get ServerName
   */
  String getServerName();

  /**
   * Get Average Load
   * 
   * @return Average Load
   */
  double getAverageLoad();

  /**
   * Get the Cluster ID
   * 
   * @return Cluster ID
   */
  String getClusterId();

  /**
   * Get the Zookeeper Quorum Info
   * 
   * @return Zookeeper Quorum Info
   */
  String getZookeeperQuorum();

  /**
   * Get hbase master start time
   * 
   * @return Start time of master in milliseconds
   */
  long getStartTime();

  /**
   * Get the hbase master active time
   * 
   * @return Time in milliseconds when master became active
   */
  long getActiveTime();

  /**
   * Whether this master is the active master
   * 
   * @return True if this is the active master
   */
  boolean getIsActiveMaster();

  /**
   * Get the live fservers
   * 
   * @return Live fservers
   */
  int getFServers();

  /**
   * Get the dead fservers
   * 
   * @return Dead fservers
   */
  int getDeadFServers();
}
