final requestAsString = request.toString()

if (!('requests' in memcache)){
    log.info "creating requests cache"
    memcache['requests'] = [] as Set
}

final requests = memcache['requests']
if (!requests.contains(requestAsString)){
    log.info "New request!"
    requests << requestAsString
    memcache['requests'] = requests

    mail.sendToAdmins subject: "CodeStory: New Request", textBody: requestAsString
}
