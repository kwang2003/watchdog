####################################################################################################
####                                             指标报告                                                                                                                                              #####
####################################################################################################
<#list reports as report>
ID:${report.id}
监控指标:${report.metric}
状态:${report.status}
消息:${report.message!""}
</#list>