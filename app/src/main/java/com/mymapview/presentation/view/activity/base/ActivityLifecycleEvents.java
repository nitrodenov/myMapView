package com.mymapview.presentation.view.activity.base;

import com.mymapview.presentation.LifecycleCallbackTrigger;


public enum ActivityLifecycleEvents implements LifecycleCallbackTrigger<ActivityLifecycle> {
    CREATE {
        @Override
        public void call(ActivityLifecycle lifecycle) {
            lifecycle.onCreate();
        }
    },
    START {
        @Override
        public void call(ActivityLifecycle lifecycle) {
            lifecycle.onStart();
        }
    },
    RESUME {
        @Override
        public void call(ActivityLifecycle lifecycle) {
            lifecycle.onResume();
        }
    },
    MENU_CREATED {
        @Override
        public void call(ActivityLifecycle lifecycle) {
            lifecycle.onMenuCreated();
        }
    },
    PAUSE {
        @Override
        public void call(ActivityLifecycle lifecycle) {
            lifecycle.onPause();
        }
    },
    STOP {
        @Override
        public void call(ActivityLifecycle lifecycle) {
            lifecycle.onStop();
        }
    },
    DESTROY {
        @Override
        public void call(ActivityLifecycle lifecycle) {
            lifecycle.onDestroy();
        }
    }
}
