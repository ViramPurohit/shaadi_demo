package shaadi.com.matches

import android.content.res.Configuration
import android.os.Bundle
import shaadi.com.R
import shaadi.com.base.BaseActivity

class MatchListActivity : BaseActivity() {

    override fun layoutId() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addFragments(supportFragmentManager,
            MatchListFragment.newInstance())

    }

}
