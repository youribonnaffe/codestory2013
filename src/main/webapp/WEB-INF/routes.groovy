get "/", forward: "/question.groovy"

get "/**/*", forward: "/debug.groovy"
post "/**/*", forward: "/debug.groovy"
put "/**/", forward: "/debug.groovy"
delete "/**/*", forward: "/debug.groovy"
