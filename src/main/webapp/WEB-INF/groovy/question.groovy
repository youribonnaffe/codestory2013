log.info "You asked: $params"

def question = params.q
switch (question){
    case "Quelle est ton adresse email" : sout.print "youribm@gmail.com"; break;
    case "Es tu heureux de participer(OUI/NON)" : sout.print "OUI"; break;
    case "Es tu abonne a la mailing list(OUI/NON)" : sout.print "OUI"; break;
    case "Est ce que tu reponds toujours oui(OUI/NON)" : sout.print "NON"; break;
    case "Es tu pret a recevoir une enonce au format markdown par http post(OUI/NON)" : sout.print "OUI"; break;
    case "As tu bien recu le premier enonce(OUI/NON)" : sout.print "NON"; break;
}
