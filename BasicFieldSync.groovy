class BasicFieldSync 
{
  static receive(issue,
		 		 replica,
		 		 nodeHelper,
		 		 commentHelper
		 		 ) {

    	issue.summary      = replica.summary
	issue.description  = replica.description
	issue.assignee     = nodeHelper.getUserByUsername(replica.assignee?.username)
	issue.reporter     = nodeHelper.getUserByUsername(replica.reporter?.username)
	issue.labels       = replica.labels
	issue.comments     = "hello 2"
	//issue.attachments  = attachmentHelper.mergeAttachments(issue, replica)
  }
}
