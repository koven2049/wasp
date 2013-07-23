// Autogenerated Jamon implementation
// /Users/jaywong/data/opensource/hadoop/wasp/trunk/src/main/jamon/./org/apache/wasp/tmpl/master/BackupMasterListTmpl.jamon

package org.apache.wasp.tmpl.master;

// 26, 9
import java.util.*;
// 27, 9
import org.apache.hadoop.util.StringUtils;
// 28, 9
import org.apache.hadoop.hbase.util.Bytes;
// 29, 9
import org.apache.wasp.master.FMaster;
// 30, 9
import org.apache.hadoop.hbase.HConstants;
// 31, 9
import org.apache.wasp.ServerName;
// 32, 9
import org.apache.wasp.ClusterStatus;

public class BackupMasterListTmplImpl
  extends org.jamon.AbstractTemplateImpl
  implements BackupMasterListTmpl.Intf

{
  private final FMaster master;
  protected static BackupMasterListTmpl.ImplData __jamon_setOptionalArguments(BackupMasterListTmpl.ImplData p_implData)
  {
    return p_implData;
  }
  public BackupMasterListTmplImpl(org.jamon.TemplateManager p_templateManager, BackupMasterListTmpl.ImplData p_implData)
  {
    super(p_templateManager, __jamon_setOptionalArguments(p_implData));
    master = p_implData.getMaster();
  }
  
  public void renderNoFlush(@SuppressWarnings({"unused","hiding"}) final java.io.Writer jamonWriter)
    throws java.io.IOException
  {
    // 35, 1
    
Collection<ServerName> backupMasters = null;
if (master.isActiveMaster()) {
    ClusterStatus status = master.getClusterStatus();
    backupMasters = status.getBackupMasters();
}

    // 43, 1
    jamonWriter.write("<table class=\"table table-striped\">\n");
    // 44, 1
    if ((backupMasters != null && backupMasters.size() > 0))
    {
      // 44, 59
      jamonWriter.write("\n<tr>\n    <th>ServerName</th>\n    <th>Port</th>\n    <th>Start Time</th>\n</tr>\n");
      // 50, 1
      
    ServerName [] serverNames = backupMasters.toArray(new ServerName[backupMasters.size()]);
    Arrays.sort(serverNames);
    for (ServerName serverName: serverNames) {

      // 55, 1
      jamonWriter.write("<tr>\n    <td>");
      // 56, 9
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(serverName.getHostname()), jamonWriter);
      // 56, 39
      jamonWriter.write("</td>\n    <td>");
      // 57, 9
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(serverName.getPort()), jamonWriter);
      // 57, 35
      jamonWriter.write("</td>\n    <td>");
      // 58, 9
      org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf(new Date(serverName.getStartcode())), jamonWriter);
      // 58, 50
      jamonWriter.write("</td>\n</tr>\n");
      // 60, 1
      
    }

    }
    // 63, 7
    jamonWriter.write("\n<tr><td>Total:");
    // 64, 15
    org.jamon.escaping.Escaping.HTML.write(org.jamon.emit.StandardEmitter.valueOf((backupMasters != null) ? backupMasters.size() : 0), jamonWriter);
    // 64, 71
    jamonWriter.write("</td>\n</table>\n\n\n\n\n");
  }
  
  
}