log.info "You asked: $params"

def question = params.q
switch (question){
    case "Quelle est ton adresse email" : sout.print "youribm@gmail.com"; break;
    case ~/.*(OUI\\/NON).*/ : sout.print "OUI"; break;
}
