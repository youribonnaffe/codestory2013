log.info "You asked: $params"

def question = params.q
switch (question){
    case "Quelle est ton adresse email" : sout.print "youribm@gmail.com"; break;
    case "Es tu abonne a la mailing list(OUI/NON)": sout.print "OUI"; break;
}
