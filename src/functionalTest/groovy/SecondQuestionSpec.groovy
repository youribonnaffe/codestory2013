import spock.lang.Specification

class SecondQuestionSpec extends Specification {
    void "answer second question"() {
        when:
        def curl = "curl http://localhost:8080/?q=Es+tu+abonne+a+la+mailing+list(OUI/NON)".execute()

        then:
        curl.in.text == "OUI"
    }
}
