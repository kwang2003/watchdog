
####################################################################################################
####                                             监控器信息                                                                                                                                          #####
####################################################################################################
ID:${monitor.id}		
类型:${monitor.type}		
名称:${monitor.name}	
主机:${monitor.host}
端口:${monitor.port}
间隔:${monitor.pollingInterval}
####################################################################################################
####                                             监控记录                                                                                                                                              #####
####################################################################################################
${record.toString()}
消息:${record.message!""}
<#include "/alarm/common/console_reports.ftl">