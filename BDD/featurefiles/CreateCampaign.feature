@ZOHOCrm
Feature: Campaign Module
Scenario Outline: Create Campaign
Given User Should be present in CRM home page 
When he clicks on campaign module
Then campaign page should be displayed
And  he clicks on new campaign button
Then create campaign page should be displayed
And he enters campaign name as "<campaignName>"
And he enters the start date as "<startDate>"
Then he enters expected revenue as "<expectedRevenue>", "<actualCost>" as actual cost
And he enters num sent as "<numSent>"
And selects "<type>" in type dropdown, "<status>" in status dropdown
Then he enters the end date as "<endDate>"
And he enters budgeted cost as "<budgetedCost>" , expected response as "<expResp>"
When he enters the description as "<desc>"
And he clicks on save button
Then created campaign name should be displayed as "<campaignName>"

Examples:
|campaignName|startDate|expectedRevenue|actualCost|numSent|type|status|endDate|budgetedCost|expResp|desc|
|dairy milk|07/21/2024|20000|10000|1000|Telemarketing|Planning|07/29/2024|1000|100|How far you go for l|
#|Hero|07/15/2024|200000|100000|100|Banner Ads|Complete|07/25/2024|10000|20|Made in India|
#|Samsung S24 Ultra|07/07/2024|2500000|1500000|15|Trade Show|Inactive|07/18/2024|100000|50|epic just like that|