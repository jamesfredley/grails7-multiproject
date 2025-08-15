package com.example

import com.example.Speaker

class HomeController {

  def index() {
    Speaker speaker = new Speaker()
    String whatToSay = speaker.sayHello() + '<br>bla bla bla     '
    render whatToSay
  }

}
