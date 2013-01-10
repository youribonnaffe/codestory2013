import spock.lang.Specification

class Questions extends Specification {
    void "answer first question"() {
        when:
        def curl = "curl http://localhost:8080/?q=Quelle+est+ton+adresse+email".execute()

        then:
        curl.in.text == "youribm@gmail.com"
    }

    void "answer second question"() {
        when:
        def curl = "curl http://localhost:8080/?q=Es+tu+abonne+a+la+mailing+list(OUI/NON)".execute()

        then:
        curl.in.text == "OUI"
    }

    void "answer third question"() {
        when:
        def curl = "curl http://localhost:8080/?q=Es+tu+heureux+de+participer(OUI/NON)".execute()

        then:
        curl.in.text == "OUI"
    }

    void "answer fourth question"() {
        when:
        def curl = "curl http://localhost:8080/?q=Es+tu+pret+a+recevoir+une+enonce+au+format+markdown+par+http+post(OUI/NON)".execute()

        then:
        curl.in.text == "OUI"
    }

    void "answer fith question"() {
        when:
        def curl = "curl http://localhost:8080/?q=Est+ce+que+tu+reponds+toujours+oui(OUI/NON)".execute()

        then:
        curl.in.text == "NON"
    }
}
