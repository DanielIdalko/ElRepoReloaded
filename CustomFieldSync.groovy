class CustomFieldSync {
  static receive(issue,replica,comments){
    issue.summary = replica.summary
    issue.description = replica.description
    issue.comments = replica.comments
  }
}
