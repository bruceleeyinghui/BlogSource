package cn.teachcourse.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.android.pulltorefresh.PullToRefreshSlidingRemovedListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.teachcourse.R;
import cn.teachcourse.view.SlidingRemovedListView;

public class FlingRemovedActivity extends AppCompatActivity {
    private PullToRefreshSlidingRemovedListView lv;
    List<Map<String, String>> list = new ArrayList<Map<String, String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fling_removed);
        lv = (PullToRefreshSlidingRemovedListView) findViewById(R.id.lv);

        initView();
//        initViewPadding();
//        initViewCenterVertical();
//        initViewMargin();
    }

    /**
     * 一、忽略padding、margin对itemView的影响
     */
    private void initView() {
        for (int i = 0; i < 50; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("name", "TeachCourse" + i);
            map.put("company", "钊林IT博客");
            list.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, list,
                R.layout.fling_removed_item, new String[]{"name", "company"},
                new int[]{R.id.name, R.id.company});
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FlingRemovedActivity.this, "点击item" + position, Toast.LENGTH_SHORT).show();
            }
        });
        lv.setOnItemRemovedListener(new PullToRefreshSlidingRemovedListView.OnItemRemovedListener() {
            @Override
            public void itemRemoved(int position, HeaderViewListAdapter adapter) {
                list.remove(position);
                ((BaseAdapter) adapter.getWrappedAdapter()).notifyDataSetChanged();
            }
        });
    }

    /**
     * 二、考虑padding对itemView布局的影响
     */
    private void initViewPadding() {
        for (int i = 0; i < 50; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("name", "TeachCourse" + i);
            map.put("company", "钊林IT博客");
            list.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, list,
                R.layout.fling_removed_item_padding, new String[]{"name", "company"},
                new int[]{R.id.name, R.id.company});
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FlingRemovedActivity.this, "点击item" + position, Toast.LENGTH_SHORT).show();
            }
        });
        lv.setOnItemRemovedListener(new PullToRefreshSlidingRemovedListView.OnItemRemovedListener() {
            @Override
            public void itemRemoved(int position, HeaderViewListAdapter adapter) {
                list.remove(position);
                ((BaseAdapter) adapter.getWrappedAdapter()).notifyDataSetChanged();
            }
        });
    }

    /**
     * 二、考虑itemView布局垂直居中
     */
    private void initViewCenterVertical() {
        for (int i = 0; i < 50; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("name", "TeachCourse" + i);
            map.put("company", "钊林IT博客");
            list.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, list,
                R.layout.fling_removed_item_center_vertical, new String[]{"name", "company"},
                new int[]{R.id.name, R.id.company});
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FlingRemovedActivity.this, "点击item" + position, Toast.LENGTH_SHORT).show();
            }
        });
        lv.setOnItemRemovedListener(new PullToRefreshSlidingRemovedListView.OnItemRemovedListener() {
            @Override
            public void itemRemoved(int position, HeaderViewListAdapter adapter) {
                list.remove(position);
                ((BaseAdapter) adapter.getWrappedAdapter()).notifyDataSetChanged();
            }
        });
    }

    /**
     * 三、考虑margin参数
     */
    private void initViewMargin() {
        for (int i = 0; i < 50; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("name", "TeachCourse" + i);
            map.put("company", "钊林IT博客");
            list.add(map);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, list,
                R.layout.fling_removed_item_margin, new String[]{"name", "company"},
                new int[]{R.id.name, R.id.company});
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FlingRemovedActivity.this, "点击item" + position, Toast.LENGTH_SHORT).show();
            }
        });
        lv.setOnItemRemovedListener(new PullToRefreshSlidingRemovedListView.OnItemRemovedListener() {
            @Override
            public void itemRemoved(int position, HeaderViewListAdapter adapter) {
                list.remove(position);
                ((BaseAdapter) adapter.getWrappedAdapter()).notifyDataSetChanged();
            }
        });
    }
}
