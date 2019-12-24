import geb.Page

class ManageBusinessPage extends Page {

    static at = { title == "Cooperatives Online" }
    static url = "auth/main"

    static content = {
        accountButton(wait: true, required: true) { $("button.user-account-btn") }
        logOut(wait: true, required: true) { $("div", text: "Log out") }

    }

    void logoutuser() {
            accountButton.click()
            logOut.click()
    }
}
