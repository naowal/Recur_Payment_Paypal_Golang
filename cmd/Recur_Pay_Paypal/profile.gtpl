
    <div id="main-category">
        <ul class="main-category-menu">
            <li class="color-1"><a href="#"><i class="fa fa-line-chart"></i>Overall Top</a></li>
            <hr/>
            <label>Category</label>
            <li class="color-2"><a href="#"><i class="fa fa-list"></i>MY List</a></li>
            <li class="color-3"><a href="#"><i class="fa fa-user-circle-o"></i>CEO</a></li>
            <li class="color-4"><a href="#"><i class="fa fa-id-badge"></i>Senior Executive</a></li>
            <li class="color-1"><a href="#"><i class="fa fa-users"></i>Student</a></li>
            <li class="color-2"><a href="#"><i class="fa fa-paper-plane"></i>Other</a></li>
            <li class="color-3"><a href="#"><i class="fa fa-list-alt"></i>Topics</a></li>
            <li class="color-4"><a href="#"><i class="fa fa-bar-chart"></i>Economy</a></li>
            <li class="color-1"><a href="#"><i class="fa fa-tasks"></i>HR Management</a></li>
            <li class="color-2"><a href="#"><i class="fa fa-hand-peace-o"></i>Politics &amp; Society</a></li>
            <li class="color-3"><a href="#"><i class="fa fa-sitemap"></i>Technology</a>
            </li>
        </ul>
    </div>
    <!-- // main-category -->

    <div class="site-output clear">
        <!-- // col-md-2 -->

        <div id="all-output" class="col-md-12">

            <!-- End Carousel -->

            <div class="row clearfix">
                <div class="col-sm-12">

                    <div class="container">
                        <div class="card hovercard">

                            <div class="row clearfix">

                                <div class="col-sm-3">
                                    <div class="useravatar">
                                        <img alt="" src="{{.Profile.Photo}}">
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="card-info"> <span class="card-title">{{.Profile.FirstName}} {{.Profile.LastName}}</span>
                                        <p>{{.Profile.Company}}</p>
                                        <p class="inline m-r-10">Genre:<span> IT Technology </span></p>
                                        <p class="inline">Total Like:<span>52145</span></p>
                                    </div>
                                </div>
                                <div class="col-sm-3">

                                  {{if .User}}
                                      {{if eq .RouteID .User.ID}}
                                      {{else}}
                                        {{if .IsFollowed}}
                                          <form action="/unfollow" method="post">
                                            <input type="hidden" name="profile_id" value="{{.RouteID}}">
                                            <button type="submit" class="btn btn-block btn-warning text-right"> Unfollow </button>
                                          </form>
                                        {{else}}
                                          <form action="/follow" method="post">
                                            <input type="hidden" name="profile_id" value="{{.RouteID}}">
                                            <button type="submit" class="btn btn-block btn-success text-right"> Follow </button>
                                          </form>
                                        {{end}}
                                      {{end}}
                                  {{end}}

                                  </div>
                                <div class="col-sm-12 text-left m-t-20">
                                    <p>{{.Profile.Other}}</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="btn-pref btn-group btn-group-justified btn-group-lg" role="group" aria-label="...">
                <div class="btn-group" role="group">
                    <button type="button" id="stars" class="btn btn-lg btn-primary" href="#tab1" data-toggle="tab">
                <div class="">Picks</div>
            </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="favorites" class="btn btn-lg  btn-default" href="#tab2" data-toggle="tab">
                <div class=""><span>{{.Following.Number}}</span> <span class="small">Follow</span></div>
            </button>
                </div>
                <div class="btn-group" role="group">
                    <button type="button" id="following" class="btn btn-lg btn-default" href="#tab3" data-toggle="tab">
                <div class=""><span>{{.Follower.Number}}</span><span class="small"> Followers</span></div>
            </button>
                </div>

            </div>

            <div class="row clearfix">
            <div class="col-sm-12">
            <div class="well">
                <div class="tab-content">
                    <div class="tab-pane fade in active" id="tab1">
                        <div class="container">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div id="custom-search-input">
                                        <div class="input-group col-md-12">
                                            <input type="text" class="  search-query form-control" placeholder="Search Picks" />
                                            <span class="input-group-btn">
                                                        <button class="btn btn-info" type="button">
                                                            <span class=" fa fa-search"></span>
                                            </button>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                                <!-- picks-item -->
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="video-item">
                                        <div class="thumb">
                                            <div class="hover-efect"></div>
                                            <small class="time">12 Picks</small>
                                            <a href="#"><img src="demo_img/v4.png" alt=""></a>
                                        </div>
                                        <div class="video-info">
                                            <a href="#" class="title">Lorem Ipsum is simply dummy text of the printing and </a>
                                            <div class="post-details">
                                                <img class="img-responsive img-thumb" src="/static/img/1.jpg">
                                                <a class="channel-name" href="#">Toshihiro Nagahama
                                        <p>Developer</p></a>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo</p>
                                            </div>
                                            <div class="thumb-container">

                                                <ul>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                </ul>
                                            </div>
                                            <hr>
                                            <footer><span class="views">Aaj Tak </span>
                                                <span class="date"><i class="fa fa-clock-o"></i>5 hours ago </span></footer>
                                        </div>
                                    </div>
                                </div>
                                <!-- // picks-item -->


                                <!-- picks-item -->
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="video-item">
                                        <div class="thumb">
                                            <div class="hover-efect"></div>
                                            <small class="time">12 Picks</small>
                                            <a href="#"><img src="demo_img/v4.png" alt=""></a>
                                        </div>
                                        <div class="video-info">
                                            <a href="#" class="title">Lorem Ipsum is simply dummy text of the printing and </a>
                                            <div class="post-details">
                                                <img class="img-responsive img-thumb" src="/static/img/1.jpg">
                                                <a class="channel-name" href="#">Toshihiro Nagahama
                                        <p>Developer</p></a>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo</p>
                                            </div>
                                            <div class="thumb-container">

                                                <ul>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                </ul>
                                            </div>
                                            <hr>
                                            <footer><span class="views">Aaj Tak </span>
                                                <span class="date"><i class="fa fa-clock-o"></i>5 hours ago </span></footer>
                                        </div>
                                    </div>
                                </div>
                                <!-- // picks-item -->


                                <!-- picks-item -->
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="video-item">
                                        <div class="thumb">
                                            <div class="hover-efect"></div>
                                            <small class="time">12 Picks</small>
                                            <a href="#"><img src="demo_img/v4.png" alt=""></a>
                                        </div>
                                        <div class="video-info">
                                            <a href="#" class="title">Lorem Ipsum is simply dummy text of the printing and </a>
                                            <div class="post-details">
                                                <img class="img-responsive img-thumb" src="/static/img/1.jpg">
                                                <a class="channel-name" href="#">Toshihiro Nagahama
                                        <p>Developer</p></a>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo</p>
                                            </div>
                                            <div class="thumb-container">

                                                <ul>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                </ul>
                                            </div>
                                            <hr>
                                            <footer><span class="views">Aaj Tak </span>
                                                <span class="date"><i class="fa fa-clock-o"></i>5 hours ago </span></footer>
                                        </div>
                                    </div>
                                </div>
                                <!-- // picks-item -->


                                <!-- picks-item -->
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="video-item">
                                        <div class="thumb">
                                            <div class="hover-efect"></div>
                                            <small class="time">12 Picks</small>
                                            <a href="#"><img src="demo_img/v4.png" alt=""></a>
                                        </div>
                                        <div class="video-info">
                                            <a href="#" class="title">Lorem Ipsum is simply dummy text of the printing and </a>
                                            <div class="post-details">
                                                <img class="img-responsive img-thumb" src="/static/img/1.jpg">
                                                <a class="channel-name" href="#">Toshihiro Nagahama
                                        <p>Developer</p></a>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo</p>
                                            </div>
                                            <div class="thumb-container">

                                                <ul>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                </ul>
                                            </div>
                                            <hr>
                                            <footer><span class="views">Aaj Tak </span>
                                                <span class="date"><i class="fa fa-clock-o"></i>5 hours ago </span></footer>
                                        </div>
                                    </div>
                                </div>
                                <!-- // picks-item -->
                                <!-- picks-item -->
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="video-item">
                                        <div class="thumb">
                                            <div class="hover-efect"></div>
                                            <small class="time">12 Picks</small>
                                            <a href="#"><img src="demo_img/v4.png" alt=""></a>
                                        </div>
                                        <div class="video-info">
                                            <a href="#" class="title">Lorem Ipsum is simply dummy text of the printing and </a>
                                            <div class="post-details">
                                                <img class="img-responsive img-thumb" src="/static/img/1.jpg">
                                                <a class="channel-name" href="#">Toshihiro Nagahama
                                        <p>Developer</p></a>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo</p>
                                            </div>
                                            <div class="thumb-container">

                                                <ul>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                </ul>
                                            </div>
                                            <hr>
                                            <footer><span class="views">Aaj Tak </span>
                                                <span class="date"><i class="fa fa-clock-o"></i>5 hours ago </span></footer>
                                        </div>
                                    </div>
                                </div>
                                <!-- // picks-item -->
                                <!-- picks-item -->
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="video-item">
                                        <div class="thumb">
                                            <div class="hover-efect"></div>
                                            <small class="time">12 Picks</small>
                                            <a href="#"><img src="demo_img/v4.png" alt=""></a>
                                        </div>
                                        <div class="video-info">
                                            <a href="#" class="title">Lorem Ipsum is simply dummy text of the printing and </a>
                                            <div class="post-details">
                                                <img class="img-responsive img-thumb" src="/static/img/1.jpg">
                                                <a class="channel-name" href="#">Toshihiro Nagahama
                                        <p>Developer</p></a>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo</p>
                                            </div>
                                            <div class="thumb-container">

                                                <ul>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                    <li>
                                                        <img class="img-responsive thumb" src="/static/img/c1.jpg">
                                                    </li>
                                                </ul>
                                            </div>
                                            <hr>
                                            <footer><span class="views">Aaj Tak </span>
                                                <span class="date"><i class="fa fa-clock-o"></i>5 hours ago </span></footer>
                                        </div>

                                    </div>
                                </div>
                                <!-- // picks-item -->

                                <!-- Loading More Videos -->
                                <div id="loading-more" class="text-center">
                                    <i class="fa fa-refresh faa-spin animated"></i> <span>Loading more</span>
                                </div>
                                <!-- // Loading More Videos -->
                            </div>
                        </div>
                        <!-- // row -->
                    </div>
                    <div class="tab-pane fade in" id="tab2">
                        <div class="container">
                            <div class="row clearfix">

                                {{range .Following.Users}}
                                  <div class="col-sm-4">
                                      <div class="twPc-div">
                                          <a class="twPc-block"></a>
                                          <div>
                                              <div class="row clearfix">
                                                  <div class="col-sm-12">
                                                      <a title="#" href="#" class="twPc-avatarLink">
                                                          <img alt="" src="{{.Image}}" class="twPc-avatarImg">
                                                      </a>
                                                      <div class="twPc-divUser">
                                                          <div class="twPc-divName">
                                                              <a href="/profile/{{.UserID}}">{{.FirstName}} {{.LastName}}</a>
                                                          </div>
                                                          <span>
                                                      				<a href="#"><span>Individual investors</span></a>
                                                          </span>
                                                      </div>

                                                  </div>
                                              </div>
                                              <div class="row clearfix m-t-10 text-center">
                                                  <div class="col-sm-4">
                                                      <a href="#" class="profile-follow" title="">
                                                          <span class="twPc-StatValue">{{.Following}}</span>
                                                          <span class="twPc-StatLabel twPc-block">Follow</span>
                                                      </a>
                                                  </div>
                                                  <div class="col-sm-4">
                                                      <a href="#" title="Following">
                                                          <span class="twPc-StatValue">{{.Follower}}</span>
                                                          <span class="twPc-StatLabel twPc-block">Followers</span>
                                                      </a>
                                                  </div>
                                                  {{if .IsFollowed}}
                                                  <div class="col-sm-4">
                                                    <div class="twPc-button">
                                                      <form action="/unfollow" method="post">
                                                        <input type="hidden" name="profile_id" value="{{.UserID}}">
                                                        <button type="submit" class="btn btn-warning btn-block m-t-10">Unfollow</button>
                                                      </form>
                                                    </div>
                                                  </div>
                                                  {{else}}
                                                  <div class="col-sm-4">
                                                    <div class="twPc-button">
                                                      <form action="/follow" method="post">
                                                        <input type="hidden" name="profile_id" value="{{.UserID}}">
                                                        <button type="submit" class="btn btn-success btn-block m-t-10">Follow</button>
                                                      </form>
                                                    </div>
                                                  </div>
                                                  {{end}}
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                                {{end}}

                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade in" id="tab3">
                        <div class="container">
                            <div class="row clearfix">

                              {{range .Follower.Users}}
                                <div class="col-sm-4">
                                    <div class="twPc-div">
                                        <a class="twPc-block"></a>
                                        <div>
                                            <div class="row clearfix">
                                                <div class="col-sm-12">
                                                    <a href="#" class="twPc-avatarLink">
                                                        <img alt="" src="{{.Image}}" class="twPc-avatarImg">
                                                    </a>
                                                    <div class="twPc-divUser">
                                                        <div class="twPc-divName">
                                                            <a href="/profile/{{.UserID}}">{{.FirstName}} {{.LastName}}</a>
                                                        </div>
                                                        <span>
                                                            <a><span>Individual investors</span></a>
                                                        </span>
                                                    </div>

                                                </div>
                                            </div>
                                            <div class="row clearfix m-t-10 text-center">
                                                <div class="col-sm-4">
                                                    <a href="#" class="profile-follow" title="">
                                                        <span class="twPc-StatValue">{{.Following}}</span>
                                                        <span class="twPc-StatLabel twPc-block">Follow</span>
                                                    </a>
                                                </div>
                                                <div class="col-sm-4">
                                                    <a href="#" title="Following">
                                                        <span class="twPc-StatValue">{{.Follower}}</span>
                                                        <span class="twPc-StatLabel twPc-block">Followers</span>
                                                    </a>
                                                </div>
                                                      {{if .IsFollowed}}
                                                      <div class="col-sm-4">
                                                        <div class="twPc-button">
                                                          <form action="/unfollow" method="post">
                                                            <input type="hidden" name="profile_id" value="{{.UserID}}">
                                                            <button type="submit" class="btn btn-warning btn-block m-t-10">Unfollow</button>
                                                          </form>
                                                        </div>
                                                      </div>
                                                      {{else}}
                                                      <div class="col-sm-4">
                                                        <div class="twPc-button">
                                                          <form action="/follow" method="post">
                                                            <input type="hidden" name="profile_id" value="{{.UserID}}">
                                                            <button type="submit" class="btn btn-success btn-block m-t-10">Follow</button>
                                                          </form>
                                                        </div>
                                                      </div>
                                                      {{end}}

                                            </div>
                                        </div>
                                    </div>
                                </div>
                              {{end}}

                            </div>
                        </div>
                    </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
    </div>


  <script>
      $(document).ready(function() {
          $(".btn-pref .btn").click(function() {
              $(".btn-pref .btn").removeClass("btn-primary").addClass("btn-default");
              // $(".tab").addClass("active"); // instead of this do the below
              $(this).removeClass("btn-default").addClass("btn-primary");
          });
      });
  </script>

