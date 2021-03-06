package tweentyscoops.mvp.kotlin.ui.main

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import tweentyscoops.mvp.kotlin.R
import tweentyscoops.mvp.kotlin.api.model.UserInfoDao
import tweentyscoops.mvp.kotlin.di.ApplicationComponent
import tweentyscoops.mvp.kotlin.extensions.loadImage
import tweentyscoops.mvp.kotlin.extensions.text
import tweentyscoops.mvp.kotlin.extensions.toast
import tweentyscoops.mvp.kotlin.ui.base.BaseActivity
import tweentyscoops.mvp.kotlin.ui.main.fragment.MainFragment

class MainActivity : BaseActivity<MainContract.View, MainPresenter>(), MainContract.View {
    override fun updateText(message: String?) {
        tv_result text message
    }

    override fun userInfoData(userInfo: UserInfoDao?) {
        toast(userInfo?.name!!)
    }

    override fun layoutToInflate() = R.layout.activity_main

    override fun doInjection(appComponent: ApplicationComponent) {
        appComponent.inject(this)
    }

    override fun startView() {

    }

    override fun stopView() {

    }

    override fun bindView() {
        presenter.requestUserInfo("pondthaitay")
        supportFragmentManager.beginTransaction()
                .replace(R.id.container_fragment, MainFragment.newInstance())
                .commit()
    }

    override fun setupInstance() {

    }

    override fun setupView() {
        tv_result text "Test Title"
        img_test loadImage "http://ainhoaweb.es/wp-content/uploads/2016/01/Gatos-y-perros-graciosos-26.jpg"
    }

    override fun initialize() {

    }

    override fun saveInstanceState(outState: Bundle?) {

    }

    override fun restoreView(savedInstanceState: Bundle?) {

    }
}